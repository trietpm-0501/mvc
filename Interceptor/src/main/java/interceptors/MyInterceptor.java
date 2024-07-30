package interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class MyInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("\n---- MyInterceptor.preHandle ---- ");
        return true; // Tiếp tục đến xử lý tại Controller

        // Thường được dùng để kiểm tra role, thêm các thông tin vào request header,...
        // Nếu thấy có lỗi, thông thường ta sẽ tiến hành redirect người dùng đến trang khác và “return false;”
        // ví dụ:
        // if (!"Admin".equals(role)) {
        //    response.sendRedirect(request.getContextPath() + "/auth/sign-in");
        //    return false;
        // }


    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("\n---- MyInterception.postHandle ---- ");


        // Thường được dùng để kèm thêm các logic vào view
    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("\n---- MyInterception.afterCompletion ---- ");


        // Thường dùng cho các logic ghi log, đánh giá hiệu năng,...
    }

}
