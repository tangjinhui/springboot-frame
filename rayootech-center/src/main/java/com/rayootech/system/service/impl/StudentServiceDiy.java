package \testProject\rayootech-center\src\main\java\com\rayootech\system.service.impl;

import \testProject\rayootech-center\src\main\java\com\rayootech\system.entity.Student;
import \testProject\rayootech-center\src\main\java\com\rayootech\system.mapper.StudentDao;
import \testProject\rayootech-center\src\main\java\com\rayootech\system.service.MPStudentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zyb
 * @since 2018-07-25
 */
@Service
public class StudentServiceDiy extends ServiceImpl<StudentDao, Student> implements MPStudentService {

}
