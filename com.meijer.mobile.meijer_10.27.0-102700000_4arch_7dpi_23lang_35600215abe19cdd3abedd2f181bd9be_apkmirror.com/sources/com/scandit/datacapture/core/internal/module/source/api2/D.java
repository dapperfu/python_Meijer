package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import du.C13575c;
import du.C13576d;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class D implements InterfaceC13350x {

    /* renamed from: a, reason: collision with root package name */
    public static final A f124845a = new A();

    public static Surface a(p0 p0Var, List previewResolutions, i0 targetFrameSize) {
        Object next;
        Intrinsics.j(previewResolutions, "previewResolutions");
        Intrinsics.j(targetFrameSize, "targetFrameSize");
        Rational rational = new Rational(targetFrameSize.f124911a, targetFrameSize.f124912b);
        int i10 = targetFrameSize.f124913c;
        List listZ0 = CollectionsKt.Z0(previewResolutions, new C13351y());
        Iterator it = listZ0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Size size = (Size) next;
            if (Intrinsics.e(new Size(targetFrameSize.f124911a, targetFrameSize.f124912b), size)) {
                break;
            }
            int iMin = Math.min(size.getWidth(), size.getHeight());
            if (Intrinsics.e(new Rational(size.getWidth(), size.getHeight()), rational) && i10 != 0 && iMin >= i10) {
                break;
            }
        }
        size = (Size) next;
        if (size == null) {
            for (Size size2 : CollectionsKt.Z0(listZ0, new C13352z(rational.floatValue()))) {
                if (Math.min(size2.getWidth(), size2.getHeight()) >= i10) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        u0 u0Var = (u0) p0Var;
        u0Var.f124998b.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
        return (Surface) u0Var.f124999c.getValue();
    }

    public void a(Handler handler, CameraDevice cameraDevice, N cameraInfo, p0 surfaceHolder, i0 frameSize, InterfaceC13349w callback) throws CameraAccessException {
        Intrinsics.j(handler, "handler");
        Intrinsics.j(cameraDevice, "cameraDevice");
        Intrinsics.j(cameraInfo, "cameraInfo");
        Intrinsics.j(surfaceHolder, "surfaceHolder");
        Intrinsics.j(frameSize, "frameSize");
        Intrinsics.j(callback, "callback");
        try {
            Surface surfaceA = a(surfaceHolder, ((O) cameraInfo).g(), frameSize);
            A a10 = f124845a;
            ImageReader imageReaderA = A.a(frameSize);
            C0 c02 = new C0(callback);
            imageReaderA.setOnImageAvailableListener(c02, handler);
            Surface surface = imageReaderA.getSurface();
            Intrinsics.i(surface, "getSurface(...)");
            CaptureRequest.Builder builderA = E.a(cameraDevice, surfaceA, surface);
            C c10 = new C(callback, cameraDevice, surfaceA, imageReaderA, c02, handler, a10.a(cameraDevice, surfaceA));
            if (Build.VERSION.SDK_INT >= 28) {
                CaptureRequest captureRequestBuild = builderA.build();
                Intrinsics.i(captureRequestBuild, "build(...)");
                C13576d.a();
                SessionConfiguration sessionConfigurationA = C13575c.a(0, CollectionsKt.p(new OutputConfiguration(surfaceA), new OutputConfiguration(imageReaderA.getSurface())), new B(handler), c10);
                sessionConfigurationA.setSessionParameters(captureRequestBuild);
                cameraDevice.createCaptureSession(sessionConfigurationA);
                return;
            }
            cameraDevice.createCaptureSession(CollectionsKt.p(surfaceA, imageReaderA.getSurface()), c10, handler);
        } catch (CameraAccessException e10) {
            Intrinsics.j(e10, "e");
            e10.printStackTrace();
            ((C13340m) callback).a(I.f124848a);
        } catch (IllegalArgumentException e11) {
            Intrinsics.j(e11, "e");
            e11.printStackTrace();
            ((C13340m) callback).a(I.f124848a);
        } catch (IllegalStateException e12) {
            Intrinsics.j(e12, "e");
            e12.printStackTrace();
            ((C13340m) callback).a(I.f124848a);
        }
    }
}
