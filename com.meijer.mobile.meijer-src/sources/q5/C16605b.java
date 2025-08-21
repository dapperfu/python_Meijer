package q5;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m5.AbstractC15670i;
import m5.C15667f;
import m5.C15677p;
import q5.InterfaceC16606c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lq5/b;", "Lq5/c;", "Lq5/d;", "target", "Lm5/i;", "result", "<init>", "(Lq5/d;Lm5/i;)V", "", "a", "()V", "Lq5/d;", "b", "Lm5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: q5.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16605b implements InterfaceC16606c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16607d target;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15670i result;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lq5/b$a;", "Lq5/c$a;", "<init>", "()V", "Lq5/d;", "target", "Lm5/i;", "result", "Lq5/c;", "a", "(Lq5/d;Lm5/i;)Lq5/c;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: q5.b$a */
    public static final class a implements InterfaceC16606c.a {
        @Override // q5.InterfaceC16606c.a
        public InterfaceC16606c a(InterfaceC16607d target, AbstractC15670i result) {
            return new C16605b(target, result);
        }

        public boolean equals(Object other) {
            return other instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    @Override // q5.InterfaceC16606c
    public void a() {
        AbstractC15670i abstractC15670i = this.result;
        if (abstractC15670i instanceof C15677p) {
            this.target.a(((C15677p) abstractC15670i).getDrawable());
        } else {
            if (!(abstractC15670i instanceof C15667f)) {
                throw new NoWhenBranchMatchedException();
            }
            this.target.c(((C15667f) abstractC15670i).getDrawable());
        }
    }

    public C16605b(InterfaceC16607d interfaceC16607d, AbstractC15670i abstractC15670i) {
        this.target = interfaceC16607d;
        this.result = abstractC15670i;
    }
}
