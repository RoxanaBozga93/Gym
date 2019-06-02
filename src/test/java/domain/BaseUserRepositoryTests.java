/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BaseUserRepositoryTests {
//    @Autowired
//    private BaseUserRepository baseUserEntity;
//
//    @Autowired
//    private BaseUserRepoInterface baseUser;
//
//    @Test
//    public void testFindByLastName() {
//        domain.Role user = new domain.Role(ROLES.USER);
//        domain.BaseUser baseUser = new domain.BaseUser("first", "last", "email", "pass", "23467656", user);
//        baseUserEntity.persist(baseUser);
//
//        List<domain.BaseUser> findByLastName = baseUser.findByLastName(baseUser.getLastName());
//
//        assertThat(findByLastName).extracting(domain.BaseUser::getLastName).containsOnly(baseUser.getLastName());
//    }
}