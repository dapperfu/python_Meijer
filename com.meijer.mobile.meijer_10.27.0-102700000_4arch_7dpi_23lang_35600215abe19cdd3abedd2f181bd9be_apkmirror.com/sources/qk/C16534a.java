package qk;

import com.google.gson.Gson;
import com.google.gson.f;
import com.meijer.mobile.core.networking.deserializer.AccountServiceErrorTypeDeserializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import rk.EnumC16795a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqk/a;", "", "<init>", "()V", "Lcom/google/gson/Gson;", "a", "()Lcom/google/gson/Gson;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qk.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16534a {

    /* renamed from: a, reason: collision with root package name */
    public static final C16534a f157306a = new C16534a();

    @JvmStatic
    public static final Gson a() {
        Gson gsonB = new f().d(EnumC16795a.class, new AccountServiceErrorTypeDeserializer()).b();
        Intrinsics.i(gsonB, "create(...)");
        return gsonB;
    }

    private C16534a() {
    }
}
