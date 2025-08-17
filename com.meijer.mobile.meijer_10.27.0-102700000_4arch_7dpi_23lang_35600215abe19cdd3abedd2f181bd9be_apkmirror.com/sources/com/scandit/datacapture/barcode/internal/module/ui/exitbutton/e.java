package com.scandit.datacapture.barcode.internal.module.ui.exitbutton;

import android.view.View;
import com.scandit.datacapture.barcode.internal.module.ui.exitbutton.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f123320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f123321b;

    public static final void a(f this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        Function0 function0 = this$0.f123323b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, f fVar) {
        super(0);
        this.f123320a = bVar;
        this.f123321b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c invoke() {
        c cVarA = ((b) this.f123320a).a();
        final f fVar = this.f123321b;
        cVarA.setOnClickListener(new View.OnClickListener() { // from class: Wt.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.a(fVar, view);
            }
        });
        return cVarA;
    }
}
