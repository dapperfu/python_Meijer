package kotlin;

import kotlin.C6327j;
import kotlin.InterfaceC6326i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lf0/g;", "", "", "offset", "size", "containerSize", "a", "(FFF)F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC13808g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f130358a;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lf0/g$a;", "", "<init>", "()V", "", "offset", "size", "containerSize", "a", "(FFF)F", "Lc0/i;", "b", "Lc0/i;", "c", "()Lc0/i;", "DefaultScrollAnimationSpec", "Lf0/g;", "Lf0/g;", "()Lf0/g;", "DefaultBringIntoViewSpec", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f0.g$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f130358a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC6326i<Float> DefaultScrollAnimationSpec = C6327j.j(0.0f, 0.0f, null, 7, null);

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC13808g DefaultBringIntoViewSpec = new C2069a();

        public final float a(float offset, float size, float containerSize) {
            float f10 = size + offset;
            if (offset >= 0.0f && f10 <= containerSize) {
                return 0.0f;
            }
            if (offset < 0.0f && f10 > containerSize) {
                return 0.0f;
            }
            float f11 = f10 - containerSize;
            return Math.abs(offset) < Math.abs(f11) ? offset : f11;
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f0/g$a$a", "Lf0/g;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: f0.g$a$a, reason: collision with other inner class name */
        public static final class C2069a implements InterfaceC13808g {
            C2069a() {
            }
        }

        public final InterfaceC13808g b() {
            return DefaultBringIntoViewSpec;
        }

        public final InterfaceC6326i<Float> c() {
            return DefaultScrollAnimationSpec;
        }

        private Companion() {
        }
    }

    default float a(float offset, float size, float containerSize) {
        return INSTANCE.a(offset, size, containerSize);
    }
}
