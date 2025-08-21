package com.scandit.datacapture.core.internal.sdk.source;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@DjinniGenerated
/* loaded from: classes12.dex */
public final class NativeBitmapConfig {
    public static final NativeBitmapConfig ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ NativeBitmapConfig[] f126459a;

    static {
        NativeBitmapConfig nativeBitmapConfig = new NativeBitmapConfig();
        ARGB_8888 = nativeBitmapConfig;
        f126459a = new NativeBitmapConfig[]{nativeBitmapConfig};
    }

    private NativeBitmapConfig() {
    }

    public static NativeBitmapConfig valueOf(String str) {
        return (NativeBitmapConfig) Enum.valueOf(NativeBitmapConfig.class, str);
    }

    public static NativeBitmapConfig[] values() {
        return (NativeBitmapConfig[]) f126459a.clone();
    }
}
