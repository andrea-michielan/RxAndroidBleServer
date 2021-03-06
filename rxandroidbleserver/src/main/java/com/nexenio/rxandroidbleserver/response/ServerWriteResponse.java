package com.nexenio.rxandroidbleserver.response;

import com.nexenio.rxandroidbleserver.request.RxBleWriteRequest;

public class ServerWriteResponse extends BaseServerResponse {

    public ServerWriteResponse(RxBleWriteRequest request) {
        super(request, request.getValue());
    }

    @Override
    public String toString() {
        return "ServerWriteResponse{} " + super.toString();
    }

}
