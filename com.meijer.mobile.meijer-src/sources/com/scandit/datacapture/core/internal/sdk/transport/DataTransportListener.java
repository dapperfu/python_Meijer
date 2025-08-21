package com.scandit.datacapture.core.internal.sdk.transport;

import com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportError;
import com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/transport/DataTransportListener;", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeDataTransportListener;", "impl", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/data/NativeDataTransportListener;)V", "", "onConnected", "()V", "onDisconnected", "", "data", "onDataReceived", "([B)V", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeDataTransportError;", "error", "onError", "(Lcom/scandit/datacapture/core/internal/sdk/data/NativeDataTransportError;)V", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class DataTransportListener extends NativeDataTransportListener {

    /* renamed from: a, reason: collision with root package name */
    private final NativeDataTransportListener f126467a;

    public DataTransportListener(NativeDataTransportListener impl) {
        Intrinsics.j(impl, "impl");
        this.f126467a = impl;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportListener
    public void onConnected() {
        this.f126467a.onConnected();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportListener
    public void onDataReceived(byte[] data) {
        this.f126467a.onDataReceived(data);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportListener
    public void onDisconnected() {
        this.f126467a.onDisconnected();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportListener
    public void onError(NativeDataTransportError error) {
        this.f126467a.onError(error);
    }
}
