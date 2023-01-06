package io.codeinet;

import javax.inject.Named;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;


@Named("stream")
public class PortMon implements RequestStreamHandler {

    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {

    }
}
