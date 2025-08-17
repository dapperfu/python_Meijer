package com.scandit.datacapture.core.internal.module.source.api2;

import android.media.Image;
import android.media.ImageReader;
import com.fullstory.FS;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class C0 implements ImageReader.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC13349w f124842a;

    /* renamed from: b, reason: collision with root package name */
    public int f124843b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f124844c;

    public C0(InterfaceC13349w callback) {
        Intrinsics.j(callback, "callback");
        this.f124842a = callback;
        this.f124844c = true;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader reader) {
        Intrinsics.j(reader, "reader");
        try {
            Image imageAcquireLatestImage = reader.acquireLatestImage();
            if (imageAcquireLatestImage == null) {
                return;
            }
            if (!this.f124844c) {
                imageAcquireLatestImage.close();
                return;
            }
            try {
                ((C13340m) this.f124842a).a(imageAcquireLatestImage);
                AutoCloseableKt.a(imageAcquireLatestImage, null);
            } finally {
            }
        } catch (IllegalStateException unused) {
            if (this.f124843b == 0) {
                Intrinsics.j("No buffer available for next image.", "message");
                FS.log_i("sdc-core", "No buffer available for next image.");
            }
            this.f124843b = (this.f124843b + 1) % 30;
        }
    }
}
