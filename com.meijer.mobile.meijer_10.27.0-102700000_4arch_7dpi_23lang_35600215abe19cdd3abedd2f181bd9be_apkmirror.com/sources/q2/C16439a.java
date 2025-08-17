package q2;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16439a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f156694a;

    /* renamed from: b, reason: collision with root package name */
    private final y f156695b;

    /* renamed from: c, reason: collision with root package name */
    private final int f156696c;

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f156694a);
        this.f156695b.e0(this.f156696c, bundle);
    }

    public C16439a(int i10, y yVar, int i11) {
        this.f156694a = i10;
        this.f156695b = yVar;
        this.f156696c = i11;
    }
}
