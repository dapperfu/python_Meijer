package androidx.room;

import android.content.Context;
import androidx.room.G;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/room/w;", "", "<init>", "()V", "Landroidx/room/G;", "T", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "klass", "Landroidx/room/G$a;", "b", "(Landroid/content/Context;Ljava/lang/Class;)Landroidx/room/G$a;", "", "name", "a", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/G$a;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.room.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6136w {

    /* renamed from: a, reason: collision with root package name */
    public static final C6136w f58652a = new C6136w();

    @JvmStatic
    public static final <T extends G> G.a<T> a(Context context, Class<T> klass, String name) {
        Intrinsics.j(context, "context");
        Intrinsics.j(klass, "klass");
        if (name == null || StringsKt.r0(name)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (Intrinsics.e(name, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new G.a<>(context, klass, name);
    }

    @JvmStatic
    public static final <T extends G> G.a<T> b(Context context, Class<T> klass) {
        Intrinsics.j(context, "context");
        Intrinsics.j(klass, "klass");
        return new G.a<>(context, klass, null);
    }

    private C6136w() {
    }
}
