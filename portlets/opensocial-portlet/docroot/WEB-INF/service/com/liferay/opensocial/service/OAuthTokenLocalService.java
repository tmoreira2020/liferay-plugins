/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.opensocial.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

/**
 * The interface for the o auth token local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OAuthTokenLocalServiceUtil
 * @see com.liferay.opensocial.service.base.OAuthTokenLocalServiceBaseImpl
 * @see com.liferay.opensocial.service.impl.OAuthTokenLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface OAuthTokenLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OAuthTokenLocalServiceUtil} to access the o auth token local service. Add custom service methods to {@link com.liferay.opensocial.service.impl.OAuthTokenLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the o auth token to the database. Also notifies the appropriate model listeners.
	*
	* @param oAuthToken the o auth token to add
	* @return the o auth token that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.opensocial.model.OAuthToken addOAuthToken(
		com.liferay.opensocial.model.OAuthToken oAuthToken)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new o auth token with the primary key. Does not add the o auth token to the database.
	*
	* @param oauthTokenId the primary key for the new o auth token
	* @return the new o auth token
	*/
	public com.liferay.opensocial.model.OAuthToken createOAuthToken(
		long oauthTokenId);

	/**
	* Deletes the o auth token with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oauthTokenId the primary key of the o auth token to delete
	* @throws PortalException if a o auth token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteOAuthToken(long oauthTokenId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the o auth token from the database. Also notifies the appropriate model listeners.
	*
	* @param oAuthToken the o auth token to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteOAuthToken(
		com.liferay.opensocial.model.OAuthToken oAuthToken)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the o auth token with the primary key.
	*
	* @param oauthTokenId the primary key of the o auth token to get
	* @return the o auth token
	* @throws PortalException if a o auth token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.opensocial.model.OAuthToken getOAuthToken(
		long oauthTokenId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets a range of all the o auth tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of o auth tokens to return
	* @param end the upper bound of the range of o auth tokens to return (not inclusive)
	* @return the range of o auth tokens
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.opensocial.model.OAuthToken> getOAuthTokens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of o auth tokens.
	*
	* @return the number of o auth tokens
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getOAuthTokensCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the o auth token in the database. Also notifies the appropriate model listeners.
	*
	* @param oAuthToken the o auth token to update
	* @return the o auth token that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.opensocial.model.OAuthToken updateOAuthToken(
		com.liferay.opensocial.model.OAuthToken oAuthToken)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the o auth token in the database. Also notifies the appropriate model listeners.
	*
	* @param oAuthToken the o auth token to update
	* @param merge whether to merge the o auth token with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the o auth token that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.opensocial.model.OAuthToken updateOAuthToken(
		com.liferay.opensocial.model.OAuthToken oAuthToken, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.opensocial.model.OAuthToken addOAuthToken(long userId,
		long gadgetId, long moduleId, java.lang.String serviceName,
		java.lang.String tokenName, java.lang.String accessToken,
		java.lang.String tokenSecret, java.lang.String sessionHandle,
		long tokenExpireMillis)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void deleteOAuthToken(long userId, long gadgetId, long moduleId,
		java.lang.String serviceName, java.lang.String tokenName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void deleteOAuthTokens(long gadgetId, java.lang.String serviceName)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.opensocial.model.OAuthToken getOAuthToken(long userId,
		long gadgetId, long moduleId, java.lang.String serviceName,
		java.lang.String tokenName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.opensocial.model.OAuthToken> getOAuthTokens(
		long gadgetId, java.lang.String serviceName)
		throws com.liferay.portal.kernel.exception.SystemException;
}