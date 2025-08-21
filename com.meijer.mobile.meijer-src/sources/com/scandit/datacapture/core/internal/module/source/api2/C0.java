package com.scandit.datacapture.core.internal.module.source.api2;

import android.media.Image;
import android.media.ImageReader;
import com.fullstory.FS;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class C0 implements ImageReader.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC13482w f125794a;

    /* renamed from: b, reason: collision with root package name */
    public int f125795b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f125796c;

    public C0(InterfaceC13482w callback) {
        Intrinsics.j(callback, "callback");
        this.f125794a = callback;
        this.f125796c = true;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader reader) {
        Intrinsics.j(reader, "reader");
        try {
            Image imageAcquireLatestImage = reader.acquireLatestImage();
            if (imageAcquireLatestImage == null) {
                return;
            }
            if (!this.f125796c) {
                imageAcquireLatestImage.close();
                return;
            }
            try {
                ((C13473m) this.f125794a).a(imageAcquireLatestImage);
                AutoCloseableKt.a(imageAcquireLatestImage, null);
            } finally {
            }
        } catch (IllegalStateException unused) {
            if (this.f125795b == 0) {
                Intrinsics.j("No buffer available for next image.", "message");
                FS.log_i("sdc-core", "No buffer available for next image.");
            }
            this.f125795b = (this.f125795b + 1) % 30;
        }
    }
}
