package com.scandit.datacapture.core.internal.sdk.analytics;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeAnalyticsSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeAnalyticsSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126301a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_setBoolProperty(long j10, String str, boolean z10);

        private native void native_setStringProperty(long j10, String str, String str2);

        @Override // com.scandit.datacapture.core.internal.sdk.analytics.NativeAnalyticsSettings
        public void setBoolProperty(String str, boolean z10) {
            native_setBoolProperty(this.nativeRef, str, z10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.analytics.NativeAnalyticsSettings
        public void setStringProperty(String str, String str2) {
            native_setStringProperty(this.nativeRef, str, str2);
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

    public static native NativeAnalyticsSettings create();

    public abstract void setBoolProperty(String str, boolean z10);

    public abstract void setStringProperty(String str, String str2);
}
