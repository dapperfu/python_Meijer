package com.scandit.datacapture.core.internal.sdk.analytics;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativePropertySubscriber {

    @DjinniGenerated
    public static final class CppProxy extends NativePropertySubscriber {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125350a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_onPropertyChanged(long j10, JSONObject jSONObject);

        @Override // com.scandit.datacapture.core.internal.sdk.analytics.NativePropertySubscriber
        public void onPropertyChanged(JSONObject jSONObject) {
            native_onPropertyChanged(this.nativeRef, jSONObject);
        }

        private CppProxy(long j10) {
            if (j10 != 0) {
                this.nativeRef = j10;
                NativeObjectManager.register(this, j10);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }
    }

    public abstract void onPropertyChanged(JSONObject jSONObject);
}
