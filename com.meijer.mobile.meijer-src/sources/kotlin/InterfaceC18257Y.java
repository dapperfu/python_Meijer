package kotlin;

import androidx.compose.runtime.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Ly1/Y;", "Landroidx/compose/runtime/z1;", "", "", "g", "()Z", "cacheable", "a", "b", "Ly1/Y$a;", "Ly1/Y$b;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y1.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC18257Y extends z1<Object> {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ly1/Y$a;", "Ly1/Y;", "Landroidx/compose/runtime/z1;", "", "Ly1/g;", "current", "<init>", "(Ly1/g;)V", "a", "Ly1/g;", "getCurrent$ui_text_release", "()Ly1/g;", "getValue", "()Ljava/lang/Object;", "value", "", "g", "()Z", "cacheable", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y1.Y$a */
    public static final class a implements InterfaceC18257Y, z1<Object> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C18264g current;

        @Override // kotlin.InterfaceC18257Y
        /* renamed from: g */
        public boolean getCacheable() {
            return this.current.getCacheable();
        }

        @Override // androidx.compose.runtime.z1
        public Object getValue() {
            return this.current.getValue();
        }

        public a(C18264g c18264g) {
            this.current = c18264g;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ly1/Y$b;", "Ly1/Y;", "", "value", "", "cacheable", "<init>", "(Ljava/lang/Object;Z)V", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "b", "Z", "g", "()Z", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y1.Y$b */
    public static final class b implements InterfaceC18257Y {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object value;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean cacheable;

        public b(Object obj, boolean z10) {
            this.value = obj;
            this.cacheable = z10;
        }

        public /* synthetic */ b(Object obj, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i10 & 2) != 0 ? true : z10);
        }

        @Override // kotlin.InterfaceC18257Y
        /* renamed from: g, reason: from getter */
        public boolean getCacheable() {
            return this.cacheable;
        }

        @Override // androidx.compose.runtime.z1
        public Object getValue() {
            return this.value;
        }
    }

    /* renamed from: g */
    boolean getCacheable();
}
