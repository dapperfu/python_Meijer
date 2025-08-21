package com.scandit.datacapture.barcode.internal.module.ui.shutterbutton;

import android.view.View;
import com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f124369a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(0);
        this.f124369a = iVar;
    }

    public static final void a(i this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        Function0 function0 = this$0.f124372c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f invoke() {
        f fVarA = ((b) this.f124369a.f124370a).a();
        final i iVar = this.f124369a;
        fVarA.setOnClickListener(new View.OnClickListener() { // from class: Yt.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.a(iVar, view);
            }
        });
        return fVarA;
    }
}
