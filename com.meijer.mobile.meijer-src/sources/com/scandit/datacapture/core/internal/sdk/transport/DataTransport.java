package com.scandit.datacapture.core.internal.sdk.transport;

import com.scandit.datacapture.core.internal.sdk.data.NativeDataTransport;
import com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportListener;
import com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\t\u001a\u00020\r8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/transport/DataTransport;", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeDataTransport;", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeDataTransportType;", "type", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/data/NativeDataTransportType;)V", "getType", "()Lcom/scandit/datacapture/core/internal/sdk/data/NativeDataTransportType;", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeDataTransportListener;", "listener", "", "setListener", "(Lcom/scandit/datacapture/core/internal/sdk/data/NativeDataTransportListener;)V", "Lcom/scandit/datacapture/core/internal/sdk/transport/DataTransportListener;", "Lcom/scandit/datacapture/core/internal/sdk/transport/DataTransportListener;", "getListener", "()Lcom/scandit/datacapture/core/internal/sdk/transport/DataTransportListener;", "(Lcom/scandit/datacapture/core/internal/sdk/transport/DataTransportListener;)V", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public abstract class DataTransport extends NativeDataTransport {

    /* renamed from: a, reason: collision with root package name */
    private final NativeDataTransportType f126466a;
    protected DataTransportListener listener;

    protected final void setListener(DataTransportListener dataTransportListener) {
        Intrinsics.j(dataTransportListener, "<set-?>");
        this.listener = dataTransportListener;
    }

    public DataTransport(NativeDataTransportType type) {
        Intrinsics.j(type, "type");
        this.f126466a = type;
    }

    protected final DataTransportListener getListener() {
        DataTransportListener dataTransportListener = this.listener;
        if (dataTransportListener != null) {
            return dataTransportListener;
        }
        Intrinsics.x("listener");
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.data.NativeDataTransport
    /* renamed from: getType, reason: from getter */
    public NativeDataTransportType getF126466a() {
        return this.f126466a;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.data.NativeDataTransport
    public void setListener(NativeDataTransportListener listener) {
        Intrinsics.j(listener, "listener");
        setListener(new DataTransportListener(listener));
    }
}
