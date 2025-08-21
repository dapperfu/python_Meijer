package com.scandit.datacapture.core.internal.module.gl;

import com.scandit.datacapture.core.internal.module.ui.video.NativeCopiedCameraTexture;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f125621a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f125622b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f125623c;

    /* renamed from: d, reason: collision with root package name */
    public NativeCopiedCameraTexture f125624d;

    /* renamed from: e, reason: collision with root package name */
    public NativeCopiedCameraTexture f125625e;

    public n() {
        m textureProducer = m.f125620a;
        Intrinsics.j(textureProducer, "textureProducer");
        this.f125621a = textureProducer;
        this.f125622b = new ArrayList();
        this.f125623c = new ArrayList();
    }
}
