package com.bugsnag.android;

import Q6.ImmutableConfig;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012Bk\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R$\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010#\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&¨\u0006)"}, d2 = {"Lcom/bugsnag/android/i;", "Lcom/bugsnag/android/c;", "", "binaryArch", PreferencesHelper.PREF_ID, "releaseStage", "version", "codeBundleId", "buildUuid", "type", "", "versionCode", "duration", "durationInForeground", "", "inForeground", "isLaunching", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "LQ6/f;", "config", "(LQ6/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Lcom/bugsnag/android/m0;", "writer", "", "h", "(Lcom/bugsnag/android/m0;)V", "i", "Ljava/lang/Number;", "()Ljava/lang/Number;", "setDuration", "(Ljava/lang/Number;)V", "j", "setDurationInForeground", "k", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setInForeground", "(Ljava/lang/Boolean;)V", "l", "setLaunching", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6473i extends C6461c {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Number duration;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Number durationInForeground;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Boolean inForeground;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Boolean isLaunching;

    public C6473i(String str, String str2, String str3, String str4, String str5, String str6, String str7, Number number, Number number2, Number number3, Boolean bool, Boolean bool2) {
        super(str, str2, str3, str4, str5, str6, str7, number);
        this.duration = number2;
        this.durationInForeground = number3;
        this.inForeground = bool;
        this.isLaunching = bool2;
    }

    public C6473i(ImmutableConfig immutableConfig, String str, String str2, String str3, String str4, String str5, Number number, Number number2, Boolean bool, Boolean bool2) {
        this(str, str2, str3, str4, str5, immutableConfig.getBuildUuid(), immutableConfig.getAppType(), immutableConfig.getVersionCode(), number, number2, bool, bool2);
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

    @Override // com.bugsnag.android.C6461c
    public void h(C6482m0 writer) throws IOException {
        super.h(writer);
        writer.l("duration").K(this.duration);
        writer.l("durationInForeground").K(this.durationInForeground);
        writer.l("inForeground").J(this.inForeground);
        writer.l("isLaunching").J(this.isLaunching);
    }
}
