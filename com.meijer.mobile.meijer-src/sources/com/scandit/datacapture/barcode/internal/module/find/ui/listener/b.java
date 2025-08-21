package com.scandit.datacapture.barcode.internal.module.find.ui.listener;

import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession;
import java.nio.charset.Charset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f123185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodeFindSession f123186b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, NativeBarcodeFindSession nativeBarcodeFindSession) {
        super(1);
        this.f123185a = cVar;
        this.f123186b = nativeBarcodeFindSession;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.j(it, "it");
        if (this.f123185a.f123187a.getTransformer() == null) {
            return it;
        }
        NativeBarcodeFindSession nativeBarcodeFindSession = this.f123186b;
        Charset charset = Charsets.UTF_8;
        byte[] bytes = it.getBytes(charset);
        Intrinsics.i(bytes, "getBytes(...)");
        byte[] transformedDataForData = nativeBarcodeFindSession.getTransformedDataForData(bytes);
        if (transformedDataForData != null) {
            return new String(transformedDataForData, charset);
        }
        return null;
    }
}
