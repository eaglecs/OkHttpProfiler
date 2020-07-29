package com.itkacher.okhttpprofiler;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * @author itkacher
 * @since 9/25/18
 */
public class OkHttpProfilerInterceptor implements Interceptor {
    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain){
        return null;
    }
}
