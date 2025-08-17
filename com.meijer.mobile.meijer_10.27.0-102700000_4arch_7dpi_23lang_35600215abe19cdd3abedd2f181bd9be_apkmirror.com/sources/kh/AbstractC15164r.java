package kh;

import mh.InterfaceC15623d;
import mh.InterfaceC15624e;

/* renamed from: kh.r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC15164r implements InterfaceC15623d<InterfaceC15624e> {

    /* renamed from: a, reason: collision with root package name */
    protected int f141955a = 3600000;

    /* renamed from: b, reason: collision with root package name */
    protected int f141956b = 300000;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f141957c = false;

    public AbstractC15164r c(int i10) {
        if (i10 < 900000) {
            i10 = 900000;
        }
        this.f141955a = i10;
        return this;
    }

    public AbstractC15164r d(int i10) {
        if (i10 <= 300000) {
            i10 = 300000;
        }
        this.f141956b = i10;
        return this;
    }
}
