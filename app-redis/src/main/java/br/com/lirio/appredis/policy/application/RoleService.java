package br.com.lirio.appredis.policy.application;

import br.com.lirio.appredis.policy.domain.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface RoleService {

    Role generate(Long fluxNumber);
}

@Service
@RequiredArgsConstructor
class RoleServiceImpl implements RoleService {


    private final RoleRepository roleRepository;

    private final RoleRepositoryImpl roleRepositoryImpl;

    @Override
    public Role generate(Long fluxNumber) {
        Role role = new Role();
        role.setFluxNumer(fluxNumber);
        Long aLong = this.roleRepositoryImpl.incrementRole();
        System.out.println(aLong);
        role.setId(aLong);
        return this.roleRepository.save(role);
    }

}

@Repository
interface RoleRepository extends CrudRepository<Role, Long> {

}

@Repository
@RequiredArgsConstructor
class RoleRepositoryImpl {

    private static final String ROLE_NUMER = "ROLE_NUMBER";

    private final RedisTemplate<String, Object> redisTemplate;

    public Long incrementRole() {
        return redisTemplate.opsForValue().increment(ROLE_NUMER);
    }
}
