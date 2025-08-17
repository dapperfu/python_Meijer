package be;

import android.animation.TypeEvaluator;
import com.medallia.digital.mobilesdk.l3;

/* renamed from: be.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6232c implements TypeEvaluator<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private static final C6232c f60120a = new C6232c();

    public static C6232c b() {
        return f60120a;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer evaluate(float f10, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f11 = ((iIntValue >> 24) & l3.f92484c) / 255.0f;
        float f12 = ((iIntValue >> 16) & l3.f92484c) / 255.0f;
        float f13 = ((iIntValue >> 8) & l3.f92484c) / 255.0f;
        int iIntValue2 = num2.intValue();
        float f14 = ((iIntValue2 >> 24) & l3.f92484c) / 255.0f;
        float f15 = ((iIntValue2 >> 16) & l3.f92484c) / 255.0f;
        float f16 = ((iIntValue2 >> 8) & l3.f92484c) / 255.0f;
        float fPow = (float) Math.pow(f12, 2.2d);
        float fPow2 = (float) Math.pow(f13, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & l3.f92484c) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(f15, 2.2d);
        float f17 = f11 + ((f14 - f11) * f10);
        float fPow5 = fPow2 + ((((float) Math.pow(f16, 2.2d)) - fPow2) * f10);
        float fPow6 = fPow3 + (f10 * (((float) Math.pow((iIntValue2 & l3.f92484c) / 255.0f, 2.2d)) - fPow3));
        return Integer.valueOf((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f10), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f17 * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}
