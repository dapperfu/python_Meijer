package com.scandit.datacapture.core.internal.module.gl;

import com.scandit.datacapture.core.internal.module.ui.video.NativeCopiedCameraTexture;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f124669a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f124670b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f124671c;

    /* renamed from: d, reason: collision with root package name */
    public NativeCopiedCameraTexture f124672d;

    /* renamed from: e, reason: collision with root package name */
    public NativeCopiedCameraTexture f124673e;

    public n() {
        m textureProducer = m.f124668a;
        Intrinsics.j(textureProducer, "textureProducer");
        this.f124669a = textureProducer;
        this.f124670b = new ArrayList();
        this.f124671c = new ArrayList();
    }
}
