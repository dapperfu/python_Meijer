package tk;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\r\u0010B\u001d\b\u0004\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00018\u0001H¦\u0002¢\u0006\u0004\b\n\u0010\tJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00018\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0014\u0010\t\u0082\u0001\u0002\f\u000f¨\u0006\u0015"}, d2 = {"Ltk/a;", "InputType", "AcceptContextType", "", "inputData", "acceptContext", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "c", "()Ljava/lang/Object;", "d", "newContext", "Ltk/a$a;", "a", "(Ljava/lang/Object;)Ltk/a$a;", "Ltk/a$b;", "b", "()Ltk/a$b;", "Ljava/lang/Object;", "f", "e", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tk.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC17116a<InputType, AcceptContextType> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InputType inputData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AcceptContextType acceptContext;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B7\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0003\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00018\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00018\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001a\u0010\u000bR)\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ltk/a$a;", "InputType", "AcceptContextType", "Ltk/a;", "inputData", "acceptContext", "", "alternatives", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V", "c", "()Ljava/lang/Object;", "d", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "f", "e", "Ljava/util/List;", "getAlternatives", "()Ljava/util/List;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tk.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class Accept<InputType, AcceptContextType> extends AbstractC17116a<InputType, AcceptContextType> {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InputType inputData;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AcceptContextType acceptContext;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Accept<InputType, AcceptContextType>> alternatives;

        public /* synthetic */ Accept(Object obj, Object obj2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i10 & 2) != 0 ? null : obj2, (i10 & 4) != 0 ? CollectionsKt.m() : list);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Accept)) {
                return false;
            }
            Accept accept = (Accept) other;
            return Intrinsics.e(this.inputData, accept.inputData) && Intrinsics.e(this.acceptContext, accept.acceptContext) && Intrinsics.e(this.alternatives, accept.alternatives);
        }

        @Override // tk.AbstractC17116a
        public final InputType c() {
            return this.inputData;
        }

        @Override // tk.AbstractC17116a
        public final AcceptContextType d() {
            return this.acceptContext;
        }

        @Override // tk.AbstractC17116a
        public AcceptContextType e() {
            return this.acceptContext;
        }

        @Override // tk.AbstractC17116a
        public InputType f() {
            return this.inputData;
        }

        public int hashCode() {
            InputType inputtype = this.inputData;
            int iHashCode = (inputtype == null ? 0 : inputtype.hashCode()) * 31;
            AcceptContextType acceptcontexttype = this.acceptContext;
            return ((iHashCode + (acceptcontexttype != null ? acceptcontexttype.hashCode() : 0)) * 31) + this.alternatives.hashCode();
        }

        public String toString() {
            return "Accept(inputData=" + this.inputData + ", acceptContext=" + this.acceptContext + ", alternatives=" + this.alternatives + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Accept(InputType inputtype, AcceptContextType acceptcontexttype, List<Accept<InputType, AcceptContextType>> alternatives) {
            super(inputtype, acceptcontexttype, null);
            Intrinsics.j(alternatives, "alternatives");
            this.inputData = inputtype;
            this.acceptContext = acceptcontexttype;
            this.alternatives = alternatives;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00018\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00018\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Ltk/a$b;", "InputType", "AcceptContextType", "Ltk/a;", "inputData", "acceptContext", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "c", "()Ljava/lang/Object;", "d", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "f", "e", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tk.a$b, reason: from toString */
    public static final /* data */ class Cancel<InputType, AcceptContextType> extends AbstractC17116a<InputType, AcceptContextType> {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InputType inputData;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AcceptContextType acceptContext;

        public Cancel(InputType inputtype, AcceptContextType acceptcontexttype) {
            super(inputtype, acceptcontexttype, null);
            this.inputData = inputtype;
            this.acceptContext = acceptcontexttype;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cancel)) {
                return false;
            }
            Cancel cancel = (Cancel) other;
            return Intrinsics.e(this.inputData, cancel.inputData) && Intrinsics.e(this.acceptContext, cancel.acceptContext);
        }

        @Override // tk.AbstractC17116a
        public final InputType c() {
            return this.inputData;
        }

        @Override // tk.AbstractC17116a
        public final AcceptContextType d() {
            return this.acceptContext;
        }

        @Override // tk.AbstractC17116a
        public AcceptContextType e() {
            return this.acceptContext;
        }

        @Override // tk.AbstractC17116a
        public InputType f() {
            return this.inputData;
        }

        public int hashCode() {
            InputType inputtype = this.inputData;
            int iHashCode = (inputtype == null ? 0 : inputtype.hashCode()) * 31;
            AcceptContextType acceptcontexttype = this.acceptContext;
            return iHashCode + (acceptcontexttype != null ? acceptcontexttype.hashCode() : 0);
        }

        public String toString() {
            return "Cancel(inputData=" + this.inputData + ", acceptContext=" + this.acceptContext + ')';
        }
    }

    public /* synthetic */ AbstractC17116a(Object obj, Object obj2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2);
    }

    public abstract InputType c();

    public abstract AcceptContextType d();

    private AbstractC17116a(InputType inputtype, AcceptContextType acceptcontexttype) {
        this.inputData = inputtype;
        this.acceptContext = acceptcontexttype;
    }

    public final Accept<InputType, AcceptContextType> a(AcceptContextType newContext) {
        return new Accept<>(f(), newContext, null, 4, null);
    }

    public final Cancel<InputType, AcceptContextType> b() {
        return new Cancel<>(f(), e());
    }

    public AcceptContextType e() {
        return this.acceptContext;
    }

    public InputType f() {
        return this.inputData;
    }
}
