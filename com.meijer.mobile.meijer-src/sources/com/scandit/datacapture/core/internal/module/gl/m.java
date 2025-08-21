package com.scandit.datacapture.core.internal.module.gl;

import com.scandit.datacapture.core.internal.module.ui.video.NativeCopiedCameraTexture;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m f125620a = new m();

    public m() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeCopiedCameraTexture nativeCopiedCameraTextureCreate = NativeCopiedCameraTexture.create();
        Intrinsics.i(nativeCopiedCameraTextureCreate, "create(...)");
        return nativeCopiedCameraTextureCreate;
    }
}
