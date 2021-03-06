//
// AppCreationRequestModel.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class AppCreationRequestModel: JSONEncodable {
    public var name: String?
    public var permissions: [String]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["name"] = self.name
        nillableDictionary["permissions"] = self.permissions?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
