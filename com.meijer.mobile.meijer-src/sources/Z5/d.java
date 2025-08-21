package Z5;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0015"}, d2 = {"LZ5/d;", "", "", "height", "width", "Landroid/graphics/Bitmap;", "initialGraphic", "", "cornerRadius", "<init>", "(IILandroid/graphics/Bitmap;F)V", "a", "I", "b", "()I", "d", "c", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "F", "()F", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Bitmap initialGraphic;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float cornerRadius;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u0018"}, d2 = {"LZ5/d$a;", "", "<init>", "()V", "", "height", "c", "(I)LZ5/d$a;", "width", "e", "", "cornerRadius", "b", "(F)LZ5/d$a;", "Landroid/graphics/Bitmap;", "initialGraphic", "d", "(Landroid/graphics/Bitmap;)LZ5/d$a;", "LZ5/d;", "a", "()LZ5/d;", "I", "Landroid/graphics/Bitmap;", "F", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    public static final class a {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Bitmap initialGraphic;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int height = 56;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int width = 56;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private float cornerRadius = 5.0f;

        public final d a() {
            Bitmap bitmap = this.initialGraphic;
            if (bitmap != null) {
                return new d(this.height, this.width, bitmap, this.cornerRadius, null);
            }
            throw new IllegalArgumentException("Initial graphic must be set");
        }

        public final a b(float cornerRadius) {
            this.cornerRadius = cornerRadius;
            return this;
        }

        public final a c(int height) {
            this.height = height;
            return this;
        }

        public final a d(Bitmap initialGraphic) {
            Intrinsics.j(initialGraphic, "initialGraphic");
            this.initialGraphic = initialGraphic;
            return this;
        }

        public final a e(int width) {
            this.width = width;
            return this;
        }
    }

    public /* synthetic */ d(int i10, int i11, Bitmap bitmap, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, bitmap, f10);
    }

    private d(int i10, int i11, Bitmap bitmap, float f10) {
        this.height = i10;
        this.width = i11;
        this.initialGraphic = bitmap;
        this.cornerRadius = f10;
    }

    /* renamed from: a, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: b, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: c, reason: from getter */
    public final Bitmap getInitialGraphic() {
        return this.initialGraphic;
    }

    /* renamed from: d, reason: from getter */
    public final int getWidth() {
        return this.width;
    }
}
