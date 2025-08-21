package com.scandit.datacapture.core.internal.sdk.common.async;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/async/IMainThreadHelper;", "", "postDelayed", "", "delay", "", "block", "Lkotlin/Function0;", "runOnMainThread", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface IMainThreadHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f126354a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/async/IMainThreadHelper$Companion;", "", "Lcom/scandit/datacapture/core/internal/sdk/common/async/IMainThreadHelper;", "default", "()Lcom/scandit/datacapture/core/internal/sdk/common/async/IMainThreadHelper;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f126354a = new Companion();

        /* renamed from: default, reason: not valid java name */
        public final IMainThreadHelper m66default() {
            return new MainThreadHelper();
        }

        private Companion() {
        }
    }

    void postDelayed(long delay, Function0<Unit> block);

    void runOnMainThread(Function0<Unit> block);
}
