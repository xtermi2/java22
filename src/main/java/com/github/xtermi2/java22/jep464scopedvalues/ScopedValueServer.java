package com.github.xtermi2.java22.jep464scopedvalues;

public class ScopedValueServer {

    static final ScopedValue<SecurityContext> SECURITY_CONTEXT = ScopedValue.newInstance();

    void serve(String request, String response, String user) {
        var securityContext = new SecurityContext(user);
        ScopedValue.where(SECURITY_CONTEXT, securityContext)
                .run(() -> RequestHandler.handle(request, response));
    }

    public record SecurityContext(String username) {
    }
}
