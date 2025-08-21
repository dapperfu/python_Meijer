package com.scandit.datacapture.core.internal.sdk;

import com.scandit.internal.sdk.bar.Callable;
import com.scandit.internal.sdk.bar.HandlerThread;
import com.scandit.internal.sdk.bar.HandlerThreadCreator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ThreadCreatorImpl;", "Lcom/scandit/internal/sdk/bar/HandlerThreadCreator;", "", "threadPriority", "<init>", "(I)V", "", "name", "Lcom/scandit/internal/sdk/bar/Callable;", "function", "Lcom/scandit/internal/sdk/bar/HandlerThread;", "create", "(Ljava/lang/String;Lcom/scandit/internal/sdk/bar/Callable;)Lcom/scandit/internal/sdk/bar/HandlerThread;", "com/scandit/datacapture/core/internal/sdk/d", "com/scandit/datacapture/core/internal/sdk/e", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ThreadCreatorImpl extends HandlerThreadCreator {

    /* renamed from: a, reason: collision with root package name */
    private final int f126296a;

    @Override // com.scandit.internal.sdk.bar.HandlerThreadCreator
    public HandlerThread create(String name, Callable function) {
        Intrinsics.j(name, "name");
        Intrinsics.j(function, "function");
        return new e(name, function, this.f126296a);
    }

    public ThreadCreatorImpl(int i10) {
        this.f126296a = i10;
    }
}
