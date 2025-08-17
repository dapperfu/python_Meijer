package com.bugsnag.android;

import android.content.Context;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BU\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/bugsnag/android/O;", "", "Landroid/content/Context;", "context", "Ljava/io/File;", "deviceIdfile", "Lkotlin/Function0;", "Ljava/util/UUID;", "deviceIdGenerator", "internalDeviceIdfile", "internalDeviceIdGenerator", "Lcom/bugsnag/android/Q0;", "sharedPrefMigrator", "Lcom/bugsnag/android/t0;", "logger", "<init>", "(Landroid/content/Context;Ljava/io/File;Lkotlin/jvm/functions/Function0;Ljava/io/File;Lkotlin/jvm/functions/Function0;Lcom/bugsnag/android/Q0;Lcom/bugsnag/android/t0;)V", "", "a", "()Ljava/lang/String;", "b", "Lcom/bugsnag/android/N;", "Lcom/bugsnag/android/N;", "persistence", "internalPersistence", "c", "Lcom/bugsnag/android/Q0;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final N persistence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final N internalPersistence;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Q0 sharedPrefMigrator;

    @JvmOverloads
    public O(Context context, File file, Function0<UUID> function0, File file2, Function0<UUID> function02, Q0 q02, InterfaceC6495t0 interfaceC6495t0) {
        this.sharedPrefMigrator = q02;
        this.persistence = new M(file, function0, interfaceC6495t0);
        this.internalPersistence = new M(file2, function02, interfaceC6495t0);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "c", "()Ljava/util/UUID;"}, k = 3, mv = {1, 4, 2})
    static final class a extends Lambda implements Function0<UUID> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f63165f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.f(uuidRandomUUID, "UUID.randomUUID()");
            return uuidRandomUUID;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "c", "()Ljava/util/UUID;"}, k = 3, mv = {1, 4, 2})
    static final class b extends Lambda implements Function0<UUID> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f63166f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.f(uuidRandomUUID, "UUID.randomUUID()");
            return uuidRandomUUID;
        }
    }

    public final String a() {
        String strA = this.persistence.a(false);
        if (strA != null) {
            return strA;
        }
        String strA2 = this.sharedPrefMigrator.a(false);
        return strA2 != null ? strA2 : this.persistence.a(true);
    }

    public final String b() {
        return this.internalPersistence.a(true);
    }

    public /* synthetic */ O(Context context, File file, Function0 function0, File file2, Function0 function02, Q0 q02, InterfaceC6495t0 interfaceC6495t0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? new File(context.getFilesDir(), "device-id") : file, (i10 & 4) != 0 ? a.f63165f : function0, (i10 & 8) != 0 ? new File(context.getFilesDir(), "internal-device-id") : file2, (i10 & 16) != 0 ? b.f63166f : function02, q02, interfaceC6495t0);
    }
}
