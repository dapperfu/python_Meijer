package com.bugsnag.android;

import R6.ImmutableConfig;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0089\u0001\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013Bk\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f\"\u0004\b#\u0010!R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010&\"\u0004\b'\u0010(R$\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010%\u001a\u0004\b$\u0010&\"\u0004\b*\u0010(¨\u0006+"}, d2 = {"Lcom/bugsnag/android/l;", "Lcom/bugsnag/android/f;", "", "binaryArch", PreferencesHelper.PREF_ID, "releaseStage", "version", "codeBundleId", "LS6/d;", "buildUuid", "type", "", "versionCode", "duration", "durationInForeground", "", "inForeground", "isLaunching", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LS6/d;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "LR6/k;", "config", "(LR6/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Lcom/bugsnag/android/v0;", "writer", "", "h", "(Lcom/bugsnag/android/v0;)V", "j", "Ljava/lang/Number;", "i", "()Ljava/lang/Number;", "setDuration", "(Ljava/lang/Number;)V", "k", "setDurationInForeground", "l", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setInForeground", "(Ljava/lang/Boolean;)V", "m", "setLaunching", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6604l extends C6592f {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Number duration;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Number durationInForeground;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Boolean inForeground;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Boolean isLaunching;

    public C6604l(String str, String str2, String str3, String str4, String str5, S6.d<String> dVar, String str6, Number number, Number number2, Number number3, Boolean bool, Boolean bool2) {
        super(str, str2, str3, str4, str5, dVar, str6, number);
        this.duration = number2;
        this.durationInForeground = number3;
        this.inForeground = bool;
        this.isLaunching = bool2;
    }

    /* renamed from: i, reason: from getter */
    public final Number getDuration() {
        return this.duration;
    }

    /* renamed from: j, reason: from getter */
    public final Number getDurationInForeground() {
        return this.durationInForeground;
    }

    /* renamed from: k, reason: from getter */
    public final Boolean getInForeground() {
        return this.inForeground;
    }

    /* renamed from: l, reason: from getter */
    public final Boolean getIsLaunching() {
        return this.isLaunching;
    }

    @Override // com.bugsnag.android.C6592f
    public void h(C6624v0 writer) throws IOException {
        super.h(writer);
        writer.l("duration").K(this.duration);
        writer.l("durationInForeground").K(this.durationInForeground);
        writer.l("inForeground").J(this.inForeground);
        writer.l("isLaunching").J(this.isLaunching);
    }

    public C6604l(ImmutableConfig immutableConfig, String str, String str2, String str3, String str4, String str5, Number number, Number number2, Boolean bool, Boolean bool2) {
        this(str, str2, str3, str4, str5, immutableConfig.g(), immutableConfig.getAppType(), immutableConfig.getVersionCode(), number, number2, bool, bool2);
    }
}
