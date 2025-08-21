package pi;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import j0.InterfaceC14902f;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lpi/g;", "", "Lpi/f;", "Lki/q1$e;", "template", "LKi/M;", "localThemeScope", "Lkotlin/Function1;", "Lj0/f;", "", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Lki/q1$e;LKi/M;Lkotlin/jvm/functions/Function3;)V", "b", "Lki/q1$e;", "()Lki/q1$e;", "c", "LKi/M;", "getLocalThemeScope", "()LKi/M;", "d", "Lkotlin/jvm/functions/Function3;", "getContent", "()Lkotlin/jvm/functions/Function3;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pi.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16446g implements Ji.h, InterfaceC16445f {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q1.Column template;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function3<InterfaceC14902f, Composer, Integer, Unit> content;

    /* JADX WARN: Multi-variable type inference failed */
    public C16446g(q1.Column template, LocalThemeScope localThemeScope, Function3<? super InterfaceC14902f, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.j(template, "template");
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(content, "content");
        this.template = template;
        this.localThemeScope = localThemeScope;
        this.content = content;
    }

    @Override // pi.InterfaceC16445f
    /* renamed from: b, reason: from getter */
    public q1.Column getTemplate() {
        return this.template;
    }

    @Override // pi.InterfaceC16445f
    public Function3<InterfaceC14902f, Composer, Integer, Unit> getContent() {
        return this.content;
    }
}
