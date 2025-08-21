package Xh;

import Eh.p;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJN\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b$\u0010\u001e¨\u0006%"}, d2 = {"LXh/b;", "", "LEh/p;", "preferenceKey", "Lbk/a;", "title", "", "checked", "enabled", "description", "inlineError", "<init>", "(LEh/p;Lbk/a;ZZLbk/a;Lbk/a;)V", "a", "(LEh/p;Lbk/a;ZZLbk/a;Lbk/a;)LXh/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LEh/p;", "g", "()LEh/p;", "b", "Lbk/a;", "h", "()Lbk/a;", "c", "Z", "()Z", "d", "e", "f", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xh.b, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class PreferenceItem {

    /* renamed from: g, reason: collision with root package name */
    public static final int f42278g = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final p preferenceKey;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean checked;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a inlineError;

    public PreferenceItem(p preferenceKey, AbstractC6392a title, boolean z10, boolean z11, AbstractC6392a description, AbstractC6392a abstractC6392a) {
        Intrinsics.j(preferenceKey, "preferenceKey");
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        this.preferenceKey = preferenceKey;
        this.title = title;
        this.checked = z10;
        this.enabled = z11;
        this.description = description;
        this.inlineError = abstractC6392a;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferenceItem)) {
            return false;
        }
        PreferenceItem preferenceItem = (PreferenceItem) other;
        return this.preferenceKey == preferenceItem.preferenceKey && Intrinsics.e(this.title, preferenceItem.title) && this.checked == preferenceItem.checked && this.enabled == preferenceItem.enabled && Intrinsics.e(this.description, preferenceItem.description) && Intrinsics.e(this.inlineError, preferenceItem.inlineError);
    }

    public static /* synthetic */ PreferenceItem b(PreferenceItem preferenceItem, p pVar, AbstractC6392a abstractC6392a, boolean z10, boolean z11, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pVar = preferenceItem.preferenceKey;
        }
        if ((i10 & 2) != 0) {
            abstractC6392a = preferenceItem.title;
        }
        if ((i10 & 4) != 0) {
            z10 = preferenceItem.checked;
        }
        if ((i10 & 8) != 0) {
            z11 = preferenceItem.enabled;
        }
        if ((i10 & 16) != 0) {
            abstractC6392a2 = preferenceItem.description;
        }
        if ((i10 & 32) != 0) {
            abstractC6392a3 = preferenceItem.inlineError;
        }
        AbstractC6392a abstractC6392a4 = abstractC6392a2;
        AbstractC6392a abstractC6392a5 = abstractC6392a3;
        return preferenceItem.a(pVar, abstractC6392a, z10, z11, abstractC6392a4, abstractC6392a5);
    }

    public final PreferenceItem a(p preferenceKey, AbstractC6392a title, boolean checked, boolean enabled, AbstractC6392a description, AbstractC6392a inlineError) {
        Intrinsics.j(preferenceKey, "preferenceKey");
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        return new PreferenceItem(preferenceKey, title, checked, enabled, description, inlineError);
    }

    /* renamed from: c, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC6392a getDescription() {
        return this.description;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC6392a getInlineError() {
        return this.inlineError;
    }

    /* renamed from: g, reason: from getter */
    public final p getPreferenceKey() {
        return this.preferenceKey;
    }

    /* renamed from: h, reason: from getter */
    public final AbstractC6392a getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.preferenceKey.hashCode() * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.checked)) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.description.hashCode()) * 31;
        AbstractC6392a abstractC6392a = this.inlineError;
        return iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode());
    }

    public String toString() {
        return "PreferenceItem(preferenceKey=" + this.preferenceKey + ", title=" + this.title + ", checked=" + this.checked + ", enabled=" + this.enabled + ", description=" + this.description + ", inlineError=" + this.inlineError + ')';
    }

    public /* synthetic */ PreferenceItem(p pVar, AbstractC6392a abstractC6392a, boolean z10, boolean z11, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, abstractC6392a, z10, (i10 & 8) != 0 ? true : z11, abstractC6392a2, (i10 & 32) != 0 ? null : abstractC6392a3);
    }
}
