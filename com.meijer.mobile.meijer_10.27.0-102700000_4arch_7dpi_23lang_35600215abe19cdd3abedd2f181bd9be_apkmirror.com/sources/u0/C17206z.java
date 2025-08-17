package u0;

import android.view.inputmethod.EditorInfo;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu0/z;", "", "<init>", "()V", "Landroid/view/inputmethod/EditorInfo;", "editorInfo", "", "a", "(Landroid/view/inputmethod/EditorInfo;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17206z {

    /* renamed from: a, reason: collision with root package name */
    public static final C17206z f162591a = new C17206z();

    private C17206z() {
    }

    public final void a(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(CollectionsKt.p(C17198q.a(), C17201u.a(), r.a(), C17199s.a(), C17202v.a(), C17203w.a(), C17204x.a()));
        editorInfo.setSupportedHandwritingGesturePreviews(SetsKt.i(C17198q.a(), C17201u.a(), r.a(), C17199s.a()));
    }
}
