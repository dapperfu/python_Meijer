package com.bugsnag.android;

import R6.ImmutableConfig;
import com.bugsnag.android.C6624v0;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0016\u0018\u00002\u00020\u0001Ba\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBC\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0019\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u001a\u0004\b$\u0010\u001a\"\u0004\b'\u0010\u001cR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,R \u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010-R.\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010/\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0019\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b1\u0010\u001c¨\u00062"}, d2 = {"Lcom/bugsnag/android/f;", "Lcom/bugsnag/android/v0$a;", "", "binaryArch", PreferencesHelper.PREF_ID, "releaseStage", "version", "codeBundleId", "LS6/d;", "buildUuid", "type", "", "versionCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LS6/d;Ljava/lang/String;Ljava/lang/Number;)V", "LR6/k;", "config", "(LR6/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/bugsnag/android/v0;", "writer", "", "h", "(Lcom/bugsnag/android/v0;)V", "toStream", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setBinaryArch", "(Ljava/lang/String;)V", "b", "c", "setId", "d", "setReleaseStage", "f", "setVersion", "e", "getCodeBundleId", "setCodeBundleId", "setType", "g", "Ljava/lang/Number;", "()Ljava/lang/Number;", "setVersionCode", "(Ljava/lang/Number;)V", "LS6/d;", "buildUuidProvider", "value", "i", "setBuildUuid", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6592f implements C6624v0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String binaryArch;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String releaseStage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String version;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String codeBundleId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String type;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Number versionCode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private S6.d<String> buildUuidProvider;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String buildUuid;

    public C6592f(String str, String str2, String str3, String str4, String str5, S6.d<String> dVar, String str6, Number number) {
        this.binaryArch = str;
        this.id = str2;
        this.releaseStage = str3;
        this.version = str4;
        this.codeBundleId = str5;
        this.type = str6;
        this.versionCode = number;
        this.buildUuidProvider = dVar;
    }

    /* renamed from: a, reason: from getter */
    public final String getBinaryArch() {
        return this.binaryArch;
    }

    public final String b() {
        String str = this.buildUuid;
        if (str != null) {
            return str;
        }
        S6.d<String> dVar = this.buildUuidProvider;
        if (dVar == null) {
            return null;
        }
        return dVar.a();
    }

    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final String getReleaseStage() {
        return this.releaseStage;
    }

    /* renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: f, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: g, reason: from getter */
    public final Number getVersionCode() {
        return this.versionCode;
    }

    public void h(C6624v0 writer) throws IOException {
        writer.l("binaryArch").O(this.binaryArch);
        writer.l("buildUUID").O(b());
        writer.l("codeBundleId").O(this.codeBundleId);
        writer.l(PreferencesHelper.PREF_ID).O(this.id);
        writer.l("releaseStage").O(this.releaseStage);
        writer.l("type").O(this.type);
        writer.l("version").O(this.version);
        writer.l("versionCode").K(this.versionCode);
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 writer) throws IOException {
        writer.d();
        h(writer);
        writer.i();
    }

    public C6592f(ImmutableConfig kVar, String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, kVar.g(), kVar.getAppType(), kVar.getVersionCode());
    }
}
