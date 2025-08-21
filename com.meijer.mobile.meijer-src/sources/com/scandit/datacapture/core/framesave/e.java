package com.scandit.datacapture.core.framesave;

import java.io.File;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f125139a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(File file) {
        super(1);
        this.f125139a = file;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return FilesKt.q(this.f125139a, new File("sequence_" + StringsKt.C0(String.valueOf(iIntValue), 3, '0')));
    }
}
