package com.bazaarvoice.bvandroidsdk;

import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import java.util.Map;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class FormField {

    @InterfaceC15617c("autoPopulate")
    private boolean autoPopulate;

    @InterfaceC15617c(alternate = {"options"}, value = "Options")
    private List<FormFieldOption> formFieldOptions;

    @InterfaceC15617c(alternate = {"type"}, value = "Type")
    private FormInputType formInputType;

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC15617c(alternate = {PreferencesHelper.PREF_ID}, value = "Id")
    private String f63013id;

    @InterfaceC15617c(alternate = {"isDefault"}, value = "Default")
    private boolean isDefault;

    @InterfaceC15617c(alternate = {"required"}, value = "Required")
    private boolean isRequired;

    @InterfaceC15617c(alternate = {"label"}, value = "Label")
    private String label;

    @InterfaceC15617c(alternate = {"maxLength"}, value = "MaxLength")
    private int maxLength;

    @InterfaceC15617c(alternate = {"minLength"}, value = "MinLength")
    private int minLength;

    @InterfaceC15617c(alternate = {"value"}, value = "Value")
    private String value;

    @InterfaceC15617c("valuesLabels")
    private Map<String, String> valueLabels;

    public List<FormFieldOption> getFormFieldOptions() {
        return this.formFieldOptions;
    }

    public FormInputType getFormInputType() {
        return this.formInputType;
    }

    public String getId() {
        return this.f63013id;
    }

    public String getLabel() {
        return this.label;
    }

    public int getMaxLength() {
        return this.maxLength;
    }

    public int getMinLength() {
        return this.minLength;
    }

    public String getType() {
        return this.formInputType.getValue();
    }

    public String getValue() {
        return this.value;
    }

    public Map<String, String> getValueLabels() {
        return this.valueLabels;
    }

    public boolean isAutoPopulate() {
        return this.autoPopulate;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public boolean isRequired() {
        return this.isRequired;
    }
}
