package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* loaded from: classes4.dex */
public class h extends b<AssetFileDescriptor> {
    @Override // com.bumptech.glide.load.data.d
    public Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    public h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
