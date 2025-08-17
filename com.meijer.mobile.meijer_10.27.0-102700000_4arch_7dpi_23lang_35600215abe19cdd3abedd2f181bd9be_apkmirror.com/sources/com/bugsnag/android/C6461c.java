package com.bugsnag.android;

import Q6.ImmutableConfig;
import com.bugsnag.android.C6482m0;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0016\u0018\u00002\u00020\u0001BY\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBC\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001bR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b&\u0010\u001bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0018\u001a\u0004\b#\u0010\u0019\"\u0004\b(\u0010\u001bR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010)\u001a\u0004\b'\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/bugsnag/android/c;", "Lcom/bugsnag/android/m0$a;", "", "binaryArch", PreferencesHelper.PREF_ID, "releaseStage", "version", "codeBundleId", "buildUuid", "type", "", "versionCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;)V", "LQ6/f;", "config", "(LQ6/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/bugsnag/android/m0;", "writer", "", "h", "(Lcom/bugsnag/android/m0;)V", "toStream", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setBinaryArch", "(Ljava/lang/String;)V", "b", "c", "setId", "d", "setReleaseStage", "f", "setVersion", "e", "getCodeBundleId", "setCodeBundleId", "setBuildUuid", "g", "setType", "Ljava/lang/Number;", "()Ljava/lang/Number;", "setVersionCode", "(Ljava/lang/Number;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6461c implements C6482m0.a {

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
    private String buildUuid;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String type;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Number versionCode;

    public C6461c(String str, String str2, String str3, String str4, String str5, String str6, String str7, Number number) {
        this.binaryArch = str;
        this.id = str2;
        this.releaseStage = str3;
        this.version = str4;
        this.codeBundleId = str5;
        this.buildUuid = str6;
        this.type = str7;
        this.versionCode = number;
    }

    public C6461c(ImmutableConfig fVar, String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, fVar.getBuildUuid(), fVar.getAppType(), fVar.getVersionCode());
    }

    /* renamed from: a, reason: from getter */
    public final String getBinaryArch() {
        return this.binaryArch;
    }

    /* renamed from: b, reason: from getter */
    public final String getBuildUuid() {
        return this.buildUuid;
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

    public void h(C6482m0 writer) throws IOException {
        writer.l("binaryArch").O(this.binaryArch);
        writer.l("buildUUID").O(this.buildUuid);
        writer.l("codeBundleId").O(this.codeBundleId);
        writer.l(PreferencesHelper.PREF_ID).O(this.id);
        writer.l("releaseStage").O(this.releaseStage);
        writer.l("type").O(this.type);
        writer.l("version").O(this.version);
        writer.l("versionCode").K(this.versionCode);
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 writer) throws IOException {
        writer.d();
        h(writer);
        writer.i();
    }
}
