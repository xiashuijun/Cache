package com.openwave.sessionmanager.cache.radius;

import java.util.List;

import com.openwave.spi.DataDictionary;

public class IdentityImpl implements Identity {
    private final int PRIME = 31;

    private final String ip;
    private final String deviceId;
    private final String userName;
    private final int createTime;
    private final String radClientId;
    private final int ttl;
    private final List<CustomAttribute> customAttributes;
    private final String accountSessionId;
    private final String correlationId;
    private final int eventTimestamp;

    public IdentityImpl(final String ip,
                        final String deviceId,
                        final String userName,
                        final int createTime,
                        final String radClientId,
                        final int ttl,
                        final List<CustomAttribute> customAttributes,
                        final String accountSessionId,
                        final String correlationId,
                        final int eventTimestamp) {
        this.ip = ip;
        this.deviceId = deviceId;
        this.userName = userName;
        this.createTime = createTime;
        this.radClientId = radClientId;
        this.ttl = ttl;
        this.customAttributes = customAttributes;
        this.accountSessionId = accountSessionId;
        this.correlationId = correlationId;
        this.eventTimestamp = eventTimestamp;
    }

    @Override
    public String getIp() {
        return this.ip;
    }

    @Override
    public String getDeviceId() {
        return deviceId;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public int getCreateTime() {
        return createTime;
    }

    @Override
    public String getRadClientId() {
        return radClientId;
    }

    @Override
    public int getTtl() {
        return ttl;
    }

    @Override
    public List<CustomAttribute> getCustomAttributes() {
        return customAttributes;
    }

    @Override
    public String getAccountSessionId() {
        return accountSessionId;
    }

    @Override
    public String getCorrelationId() {
        return correlationId;
    }

    @Override
    public int getEventTimestamp() {
        return eventTimestamp;
    }

    @Override
    public DataDictionary toDataDictionary() {
        final DataDictionary dataDictionary = new DataDictionary();

        dataDictionary.put("IP", this.ip);
        dataDictionary.put("DeviceId", this.deviceId);
        dataDictionary.put("UserName", this.userName);
        dataDictionary.put("CreateTime", this.createTime);
        dataDictionary.put("RadClientId", this.radClientId);
        dataDictionary.put("TTL", this.ttl);
        dataDictionary.put("CustomAttributes", this.customAttributes);
        dataDictionary.put("AccountSessionId", this.accountSessionId);
        dataDictionary.put("CorrelationId", this.correlationId);
        dataDictionary.put("EventTimestamp", this.eventTimestamp);

        return dataDictionary;
    }

    /*
     * Generated by eclipse. 
     *
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final IdentityImpl other = (IdentityImpl) obj;

        if (accountSessionId == null) {
            if (other.accountSessionId != null) {
                return false;
            }
        } else if (!accountSessionId.equals(other.accountSessionId)) {
            return false;
        }

        if (correlationId == null) {
            if (other.correlationId != null) {
                return false;
            }
        } else if (!correlationId.equals(other.correlationId)) {
            return false;
    }

        if (createTime != other.createTime) {
            return false;
        }

        if (customAttributes == null) {
            if (other.customAttributes != null) {
                return false;
            }
        } else if (!customAttributes.equals(other.customAttributes)) {
            return false;
        }

        if (deviceId == null) {
            if (other.deviceId != null) {
                return false;
            }
        } else if (!deviceId.equals(other.deviceId)) {
            return false;
        }

        if (eventTimestamp != other.eventTimestamp) {
            return false;
        }

        if (ip == null) {
            if (other.ip != null) {
                return false;
            }
        } else if (!ip.equals(other.ip)) {
            return false;
        }

        if (radClientId == null) {
            if (other.radClientId != null) {
                return false;
            }
        } else if (!radClientId.equals(other.radClientId)) {
            return false;
        }

        if (ttl != other.ttl) {
            return false;
        }
        
        if (userName == null) {
            if (other.userName != null) {
                return false;
            }
        } else if (!userName.equals(other.userName)) {
            return false;
        }

        return true;
    }

    /*
     * Generated by eclipse. 
     *
     */
    @Override
    public int hashCode() {
        int result = 1;

        result = PRIME * result + ((ip == null) ? 0 : ip.hashCode());
        result = PRIME * result + ((deviceId == null) ? 0 : deviceId.hashCode());
        result = PRIME * result + ((userName == null) ? 0 : userName.hashCode());
        result = PRIME * result + createTime;
        result = PRIME * result + ((radClientId == null) ? 0 : radClientId.hashCode());

        return result;    
    }
}
