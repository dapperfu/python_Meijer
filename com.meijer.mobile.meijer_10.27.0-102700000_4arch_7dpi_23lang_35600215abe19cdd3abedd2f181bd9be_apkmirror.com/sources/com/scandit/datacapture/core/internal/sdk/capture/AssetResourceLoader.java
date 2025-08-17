package com.scandit.datacapture.core.internal.sdk.capture;

import android.content.res.AssetManager;
import com.scandit.datacapture.core.internal.module.utils.i;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/capture/AssetResourceLoader;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeResourceLoader;", "Landroid/content/res/AssetManager;", "assets", "<init>", "(Landroid/content/res/AssetManager;)V", "", "Lcom/scandit/datacapture/core/internal/sdk/capture/ResourceId;", "identifier", "", "load", "(Ljava/lang/String;)[B", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class AssetResourceLoader extends NativeResourceLoader {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f125385a;

    public AssetResourceLoader(AssetManager assets) {
        Intrinsics.j(assets, "assets");
        this.f125385a = assets;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeResourceLoader
    public byte[] load(String identifier) throws IOException {
        Intrinsics.j(identifier, "identifier");
        try {
            InputStream inputStreamOpen = this.f125385a.open(identifier);
            try {
                Intrinsics.g(inputStreamOpen);
                byte[] bArrC = ByteStreamsKt.c(inputStreamOpen);
                CloseableKt.a(inputStreamOpen, null);
                return bArrC;
            } finally {
            }
        } catch (Exception unused) {
            i.a("Failed to load assets `" + identifier + "`.");
            return new byte[0];
        }
    }
}
