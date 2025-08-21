package com.scandit.datacapture.core.internal.sdk.data;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeDataTransport {
    public abstract void connect(NativeDataTransportConnectionOptions nativeDataTransportConnectionOptions);

    public abstract void disconnect();

    public abstract NativeDataTransportType getType();

    public abstract boolean isAvailable();

    public abstract void setListener(NativeDataTransportListener nativeDataTransportListener);

    public abstract void write(byte[] bArr);
}
