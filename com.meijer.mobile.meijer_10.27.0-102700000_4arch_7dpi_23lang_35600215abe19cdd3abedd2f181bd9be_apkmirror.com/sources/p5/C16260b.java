package p5;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l5.AbstractC15373i;
import l5.C15370f;
import l5.C15380p;
import p5.InterfaceC16261c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lp5/b;", "Lp5/c;", "Lp5/d;", "target", "Ll5/i;", "result", "<init>", "(Lp5/d;Ll5/i;)V", "", "a", "()V", "Lp5/d;", "b", "Ll5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: p5.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16260b implements InterfaceC16261c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16262d target;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15373i result;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lp5/b$a;", "Lp5/c$a;", "<init>", "()V", "Lp5/d;", "target", "Ll5/i;", "result", "Lp5/c;", "a", "(Lp5/d;Ll5/i;)Lp5/c;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.b$a */
    public static final class a implements InterfaceC16261c.a {
        @Override // p5.InterfaceC16261c.a
        public InterfaceC16261c a(InterfaceC16262d target, AbstractC15373i result) {
            return new C16260b(target, result);
        }

        public boolean equals(Object other) {
            return other instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    @Override // p5.InterfaceC16261c
    public void a() {
        AbstractC15373i abstractC15373i = this.result;
        if (abstractC15373i instanceof C15380p) {
            this.target.a(((C15380p) abstractC15373i).getDrawable());
        } else {
            if (!(abstractC15373i instanceof C15370f)) {
                throw new NoWhenBranchMatchedException();
            }
            this.target.c(((C15370f) abstractC15373i).getDrawable());
        }
    }

    public C16260b(InterfaceC16262d interfaceC16262d, AbstractC15373i abstractC15373i) {
        this.target = interfaceC16262d;
        this.result = abstractC15373i;
    }
}
