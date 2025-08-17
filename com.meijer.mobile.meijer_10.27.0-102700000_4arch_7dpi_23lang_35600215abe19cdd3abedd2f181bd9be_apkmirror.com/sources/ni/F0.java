package ni;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import j0.InterfaceC14800I;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B@\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lni/F0;", "", "Lni/i;", "Lji/q1$d;", "template", "Lkotlin/Function0;", "", "onClick", "Lkotlin/Function1;", "Lj0/I;", "Lkotlin/ExtensionFunctionType;", "content", "LJi/M;", "localThemeScope", "<init>", "(Lji/q1$d;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;LJi/M;)V", "b", "Lji/q1$d;", "()Lji/q1$d;", "c", "Lkotlin/jvm/functions/Function0;", "l", "()Lkotlin/jvm/functions/Function0;", "d", "Lkotlin/jvm/functions/Function3;", "getContent", "()Lkotlin/jvm/functions/Function3;", "e", "LJi/M;", "getLocalThemeScope", "()LJi/M;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class F0 implements Ii.h, InterfaceC15834i {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q1.d template;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onClick;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function3<InterfaceC14800I, Composer, Integer, Unit> content;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* JADX WARN: Multi-variable type inference failed */
    public F0(q1.d template, Function0<Unit> onClick, Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> content, LocalThemeScope localThemeScope) {
        Intrinsics.j(template, "template");
        Intrinsics.j(onClick, "onClick");
        Intrinsics.j(content, "content");
        Intrinsics.j(localThemeScope, "localThemeScope");
        this.template = template;
        this.onClick = onClick;
        this.content = content;
        this.localThemeScope = localThemeScope;
    }

    @Override // ni.InterfaceC15834i
    /* renamed from: b, reason: from getter */
    public q1.d getTemplate() {
        return this.template;
    }

    @Override // ni.InterfaceC15834i
    public Function3<InterfaceC14800I, Composer, Integer, Unit> getContent() {
        return this.content;
    }

    @Override // ni.InterfaceC15834i
    public Function0<Unit> l() {
        return this.onClick;
    }
}
