package online.templab.flippedclass.controller;

import online.templab.flippedclass.FlippedClassApplicationTest;
import online.templab.flippedclass.domain.Admin;
import online.templab.flippedclass.service.AdminService;
import org.junit.Test;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


/**
 * AdminController 单元测试类
 *
 * @author W.K
 */

@AutoConfigureMockMvc
@WebAppConfiguration
public class AdminControllerTest extends FlippedClassApplicationTest {

    @Autowired
    private WebApplicationContext context;

    @Mock
    private AdminService adminService;

    @InjectMocks
    private AdminController adminController;

    private MockMvc mockMvc;


    @Before
    public void setupMockMvc() throws Exception {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(adminController).build();
    }

    @Test
    public void testListAll() throws Exception {
        // TODO: mock的方式可能不是很正确，待修正
        List<Admin> admins = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            admins.add(new Admin());
        }
        given(adminService.listAll()).willReturn(admins);

        mockMvc.perform(MockMvcRequestBuilders.get("/pc/admin/list-all"))
                .andExpect(status().isOk())
                .andExpect(view().name("pc/admin/list-all")).andDo(print());
    }
}
