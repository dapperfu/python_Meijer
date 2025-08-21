package q2;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16594a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f157807a;

    /* renamed from: b, reason: collision with root package name */
    private final y f157808b;

    /* renamed from: c, reason: collision with root package name */
    private final int f157809c;

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f157807a);
        this.f157808b.e0(this.f157809c, bundle);
    }

    public C16594a(int i10, y yVar, int i11) {
        this.f157807a = i10;
        this.f157808b = yVar;
        this.f157809c = i11;
    }
}
