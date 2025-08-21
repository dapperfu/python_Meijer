package com.scandit.datacapture.barcode.internal.sdk.data;

import com.scandit.datacapture.barcode.data.CompositeType;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeCompositeTypeDescription {

    @DjinniGenerated
    public static final class CppProxy extends NativeCompositeTypeDescription {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124498a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native HashSet<Symbology> native_getSymbologies(long j10);

        private native EnumSet<CompositeType> native_getTypesBits(long j10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeCompositeTypeDescription
        public HashSet<Symbology> getSymbologies() {
            return native_getSymbologies(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeCompositeTypeDescription
        public EnumSet<CompositeType> getTypesBits() {
            return native_getTypesBits(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeCompositeTypeDescription
        public String toJson() {
            return native_toJson(this.nativeRef);
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

    public static native ArrayList<NativeCompositeTypeDescription> all();

    public static native NativeCompositeTypeDescription create(EnumSet<CompositeType> enumSet);

    public abstract HashSet<Symbology> getSymbologies();

    public abstract EnumSet<CompositeType> getTypesBits();

    public abstract String toJson();
}
